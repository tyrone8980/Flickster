# Project 1 - Flickster

Flickster shows the latest movies currently playing in theaters. The app utilizes the Movie Database API to display images and basic information about these movies to the user.

Time spent: **5** hour spent in total

## User Stories

The following **required** functionality is completed:

* [X] User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.

* [X] Views should be responsive for both landscape/portrait mode.
      * [X] In portrait mode, the poster image, title, and movie overview is shown.
      * [X] In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.
      
* [X] Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity.

* [X] Allow video posts to be played in full-screen using the YouTubePlayerView (2 points)

    * [X] When clicking on a popular movie (i.e. a movie voted for more than 5 stars) the video should be played immediately.
    * [X] Less popular videos rely on the detailed page should show an image preview that can initiate playing a YouTube video.

The following **optional** features are implemented:

* [ ] Display a nice default [placeholder graphic](https://guides.codepath.com/android/Displaying-Images-with-the-Glide-Library#advanced-usage) for each image during loading
* [ ] Improved the user interface by experimenting with styling and coloring.
* [ ] For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous RecyclerViews and use different ViewHolder layout files for popular movies and less popular ones.
* [ ] Add a play icon overlay to popular movies to indicate that the movie can be played (1 point).
* [ ] Apply the popular ButterKnife annotation library to reduce view boilerplate. (1 point)
* [ ] Add a rounded corners for the images using the Glide transformations. (1 point)


## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://github.com/tyrone8980/Flickster/blob/master/movie_app.gif' />

Trailer User Story:

<img src='https://github.com/tyrone8980/Flickster/blob/master/flickerprieview.gif' />

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

Describe any challenges encountered while building the app.

## Open-source libraries used

- [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright [2018] [Tyrone Harmon]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
