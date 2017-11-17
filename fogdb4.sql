create database Fogdb4;
use Fogdb4;




create table users(

user_id int(5) not null auto_increment,
userName varchar(50) not null,
userPassword varchar(50) not null,
email varchar(50) not null,
fristname varchar(50) not null,
lastname varchar(50) not null,
phone varchar(8) not null,
city varchar(50) not null,
zipcode varchar(50) not null,
address varchar(50) not null,
primary key(user_id)
);



create table employee(
employee_id int(5) not null auto_increment,
employee_username varchar(50) not null,
employee_password varchar(50) not null,
employee_firstname varchar(50) not null,
employee_lastname varchar(50) not null,
primary key(employee_id)

);


create table admin(

admin_id int(5) not null auto_increment,
admin_username varchar(50) not null,
admin_password varchar(50) not null,
primary key(admin_id)
);


create table design(
design_id int(5) not null auto_increment,
length double(10,5) not null,
width double(10,5) not null,
height double(10,5) not null,
user_id int(5) not null,
designName varchar(50) not null,
primary key(design_id),
foreign key(user_id) references users(user_id)

);





create table request(
request_id int(5) not null auto_increment,
user_id int(5) not null,
primary key(request_id),
foreign key(user_id) references users(user_id)
);

create table products(
product_id int(5) not null auto_increment,
product_name varchar(50) not null,
product_price int(50) not null,
prodduct_length double(10,5) not null,
product_width double(10,5) not null,
product_heigth double(10,5) not null,
primary key(product_id)
);


create table carport(
carport_id int(5) not null auto_increment,
carport_name varchar(50) not null,
carportWidth int(5) not null,
carportLength int(5) not null,
carportHeight int(5) not null,
stolpe_højde int(5) not null,
spær_Længde int(5) not null,
reglar_længde int(5) not null,
 lægte_længde  int(5) not null,
sternBrædt_Længde int(5) not null,
Vindskede_længde int(5) not null,
 Rem int(5) not null,
skruer varchar(50) not null,
taghældning int(10) not null,
rem_længde int(5) not null,
tag_bredde int(5) not null,
tag_højde int(5) not null,
tag_udhæng int(5) not null,
gavl_bræt_længde int(5) not null,
gavl_bræt_højde int(5) not null,
gavl_bræt_bredde int(5) not null,
product_id int(5) not null,
totalprice double(10,5) not null,
primary key(carport_id),
foreign key(product_id)references products(product_id)
);

create table orderdetails(
user_id int(5) not null,
requestStatus enum('godkendt','afventer','afvist') DEFAULT 'afventer',
carport_id int(5) not null,
totalPrice int,
requestDate datetime NOT NULL DEFAULT NOW(),
foreign key(user_id) references users(user_id),
foreign key(carport_id) references carport(carport_id)
);