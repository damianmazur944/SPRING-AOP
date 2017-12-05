ALTER TABLE user CONVERT TO CHARACTER SET utf8;
ALTER TABLE car CONVERT TO CHARACTER SET utf8;
INSERT INTO `role`(`role`) VALUES ("ROLE_ADMIN");
INSERT INTO `role`(`role`) VALUES ("ROLE_USER");
INSERT INTO `user`(`address`, `enable`, `login`, `name`, `password`, `surname`, `role_id`) VALUES ("Lublin 15",1,"admin","Damian","$2a$04$OqJ6D.441.pxVr.kBaS0ce5jpqbhzPcB7Q4GXO/s2bcJoWRokuXLW","Mazur",1);
INSERT INTO `user`(`address`, `enable`, `login`, `name`, `password`, `surname`, `role_id`) VALUES ("Warszawa 15",1,"emil1","Emil","$2a$04$OqJ6D.441.pxVr.kBaS0ce5jpqbhzPcB7Q4GXO/s2bcJoWRokuXLW","Cadima",1);
INSERT INTO `user`(`address`, `enable`, `login`, `name`, `password`, `surname`, `role_id`) VALUES ("Zamość 5",1,"mateusz","Mateusz","$2a$04$OqJ6D.441.pxVr.kBaS0ce5jpqbhzPcB7Q4GXO/s2bcJoWRokuXLW","Grudzień",1);
INSERT INTO `user`(`address`, `enable`, `login`, `name`, `password`, `surname`, `role_id`) VALUES ("London 1",1,"bernard","Bernard","$2a$04$OqJ6D.441.pxVr.kBaS0ce5jpqbhzPcB7Q4GXO/s2bcJoWRokuXLW","Boguszewski",1);
INSERT INTO `user`(`address`, `enable`, `login`, `name`, `password`, `surname`, `role_id`) VALUES ("Kraków 1",1,"emil2","Emil","$2a$04$OqJ6D.441.pxVr.kBaS0ce5jpqbhzPcB7Q4GXO/s2bcJoWRokuXLW","Smęt",1);
INSERT INTO `car`(`brand`, `displacment`, `engine_type`, `model`, `transmission_type`, `user_id`, `photo_link`) VALUES ("BMW",2500,1,"E39 525i",1,1,"https://i.pinimg.com/736x/5e/59/70/5e5970225b4e2d6c6b9dfcdcfbf45abe--bmw-e-bmw-i-e.jpg");
INSERT INTO `car`(`brand`, `displacment`, `engine_type`, `model`, `transmission_type`, `user_id`, `photo_link`) VALUES ("Saab",1900,1,"9-3",1,2,"http://www.abbottsaab.com/wp-content/uploads/2016/02/saab-93-overview.png");
INSERT INTO `car`(`brand`, `displacment`, `engine_type`, `model`, `transmission_type`, `user_id`, `photo_link`) VALUES ("Seat",1400,1,"Toledo",1,3,"https://upload.wikimedia.org/wikipedia/commons/b/b8/Seat_Toledo_rear_20080302.jpg");
INSERT INTO `car`(`brand`, `displacment`, `engine_type`, `model`, `transmission_type`, `user_id`, `photo_link`) VALUES ("Volkswagen",1900,1,"Golf IV",1,4,"https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/VW_Golf_IV_1.6_%281997%E2%80%932003%29_front_MJ.JPG/1200px-VW_Golf_IV_1.6_%281997%E2%80%932003%29_front_MJ.JPG");
INSERT INTO `car`(`brand`, `displacment`, `engine_type`, `model`, `transmission_type`, `user_id`, `photo_link`) VALUES ("Volkswagen",1900,1,"Golf III",1,5,"https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/1996-1998_Volkswagen_Golf_%281H%29_CL_5-door_hatchback_03.jpg/1200px-1996-1998_Volkswagen_Golf_%281H%29_CL_5-door_hatchback_03.jpg");

