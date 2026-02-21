Roam - Airbnb Clone Backend
Roam is a robust RESTful API built with Spring Boot designed to power a vacation rental platform. It handles user authentication, property management, search functionality, and user-specific favorites.

Key Features:-
Secure Authentication: Implements JWT (JSON Web Tokens) with a custom JwtAuthFilter for secure stateless sessions.

Property Search: Advanced search capabilities allowing users to find stays based on location and guest count.

Favorites System: DataBase locking mechanism , When a user booking a hotel then it will be blocked for the specific user and he has to do the booking process within due time .

Security Configuration: Comprehensive SecurityFilterChain that handles CORS, CSRF protection, and role-based access control.

src/main/java/com/example/AirBnb_Project/
├── Controller/    # REST Endpoints (Auth, Hotels, Favourites)
├── dto/           # Data Transfer Objects (Request/Response)
├── entity/        # Database Models (User, Hotel, Favourite)
├── repository/    # JPA Repositories
├── Service/       # Business Logic
└── config/        # Security and App Configurations


1. Prerequisites:-
JDK 17 or higher
Maven
PostgreSQL

2. Database Setup:-
Create a database named roam in PostgreSQL and update your credentials in a local application.properties

Installation:-
Clone the repository and install dependencies:
git clone https://github.com/rahulcod-3333/Roam.git
cd Roam
mvn install

Running the App:-
mvn spring-boot:run
The server will start at http://localhost:9091
