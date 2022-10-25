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
