use valsu_farma_bda;

CREATE TABLE log_update_brand(
id INT NOT NULL AUTO_INCREMENT,
dt_update DATETIME,
name_old VARCHAR(255) NOT NULL,
new_name VARCHAR(255) NOT NULL,
PRIMARY KEY(id)
);

DELIMITER //
CREATE TRIGGER tg_update_brand BEFORE UPDATE ON brand
FOR EACH ROW
BEGIN
	INSERT INTO log_update_brand(dt_update,name_old,new_name)
	VALUES(NOW(), old.name, new.name);
    END //
    DELIMITER ;