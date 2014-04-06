

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `ID` varchar(36) DEFAULT NULL,
  `NAME` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`ID`,`NAME`) values ('1','meek'),('2700f9a4-20f1-4469-a2f6-5959513adf56','lili1'),('1803ee60-ede4-469d-a59b-a1efdcdd7036','lili2'),('560eeb83-bca0-4456-94e6-d0f45a15564f','lili3');
