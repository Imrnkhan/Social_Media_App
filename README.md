# Social_Media_App

Authentication (Signup and login) is a very important part 

create an backend app for social media
new users can register
users can login

SignUp

 Post - http://localhost:8089/signup

{
   "firstName": "Imran",
  "lastName": "Khan",
  "email": "Imrankhan@gmail.com",
  "password": "Imran@#"
}


Posts


Post - http://localhost:8089/posts

{
 "content": "Bloger",
  "first_name": "Akram",
  "last_name": "Khan",
  "sex": "male",
  "phone" : "12346789",
  "message" : "to accept something every thing"
}


 Tables_in_socialapp |
+---------------------+
| hibernate_sequence  |
| post                |
| tokens              |
| users               |




![image](https://user-images.githubusercontent.com/95843558/197858324-45f6ed99-4161-450e-979b-b80b5ade2f05.png)


SignUp Integration
We will start by creating a user entity and when users signup we will create a new user in database.

User entity
Let’s create a model User. It will have five fields

1.id
2.firstName
3.lastName
4.email
5.password

Signup API#
Now, as we have all the basic setup ready, we will start creating the APIs.

The API will take first name, last name, email and password as request body and check

If user is already present, return an error response
else save the user, and return a response that user has been successfully saved.

Authentication Token
After we log in, we will get a token from the API. This token will be the authentication token, and for every subsequent request, you have to send it with it.

In the backend, the token will be checked, and the corresponding user will be retrieved. If the user is not valid, an exception will be thrown.

Generate token during sign up
Previously, we have created the sign-up method, now we will integrate the token generation while signing up.


