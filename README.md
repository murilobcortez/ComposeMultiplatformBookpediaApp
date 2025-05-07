## Overview
Simple Book listing app where users can search for books on public API (https://openlibrary.org/) and add as favorites on device local database.

 <p align="center">
  <img alt="Book List Screen" src="images/BookListScreen.png" width="45%">
&nbsp; &nbsp; &nbsp; &nbsp;
  <img alt="Book Details Screen" src="images/BookDetailsScreen.png" width="45%">
</p>

## Tech Stack
- Usecases: Search Books and mark them as Favorites using CRUD (Create, Read, Update and Delete) on local database
- Programming Language: Kotlin
- Ui development: Compose Multiplatform
- Dependency Injection: Koin
- Persistance: Local Database (Room)
- Asynchronous requests: Ktor 3.0 and Coroutines + Flow
