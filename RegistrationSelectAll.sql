DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `RegistratonSelectAll`()
BEGIN
select * from registration_details;
END$$
DELIMITER ;
