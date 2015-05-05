CREATE TABLE IF NOT EXISTS `admin_assert` (
  `assert_id` int(10),
  `assert_type` varchar(20),
  `assert_data` datetime,
  PRIMARY KEY (`assert_id`,`assert_type`)
);

CREATE TABLE IF NOT EXISTS `user_action` (
  `assert_id` int(10),
  `assert_type` varchar(20),
  `assert_data` datetime,
  PRIMARY KEY (`assert_id`)
);
CREATE TABLE IF NOT EXISTS `user_update` (
  `assert_id` int(10),
  `assert_type` varchar(20),
  `assert_data` datetime,
  `assert_data2` datetime,
  PRIMARY KEY (`assert_id`)
);

INSERT INTO `user_update` (`assert_id`, `assert_type`, `assert_data`, `assert_data2`) VALUES
('1', 'fabio', '1', '20150325'),
('2', 'gambi', '2', '20150325'),
('3', 'zambe', '3', '20150325');
