use valsu_farma_bda;

CREATE TABLE log_update_category(
id INT NOT NULL AUTO_INCREMENT,
dt_update DATETIME,
name_old VARCHAR(255) NOT NULL,
name_new VARCHAR(255) NOT NULL,
description_old VARCHAR(255) NOT NULL,
description_new VARCHAR(255) NOT NULL,
PRIMARY KEY(id)
);

DELIMITER //
CREATE TRIGGER tg_update_category BEFORE UPDATE ON category
FOR EACH ROW
BEGIN
	INSERT INTO log_update_category(dt_update,name_old,name_new,description_old,description_new)
	VALUES(NOW(), old.name, new.name, old.description, new.description);
    END //
    DELIMITER ;
    
    SELECT * FROM log_update_category;