CREATE DATABASE IF NOT EXISTS `demo`;
USE `demo`;

CREATE TABLE IF NOT EXISTS `PaymenManager` (
  `id` int(11) DEFAULT NULL
);

INSERT IGNORE INTO `PaymenManager` (`id`) VALUES
	(1);
