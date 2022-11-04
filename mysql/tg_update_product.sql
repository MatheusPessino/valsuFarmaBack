use valsu_farma_bda;

CREATE TABLE log_update_product(
id INT NOT NULL AUTO_INCREMENT,
dt_update DATETIME,
name_old VARCHAR(255) NOT NULL,
name_new VARCHAR(255) NOT NULL,
description_old VARCHAR(255) NOT NULL,
description_new VARCHAR(255) NOT NULL,
price_old DOUBLE NOT NULL,
price_new DOUBLE NOT NULL,
stock_old INT NOT NULL,
stock_new INT NOT NULL,
category_old INT NOT NULL,
category_new INT NOT NULL,
brand_old INT NOT NULL,
brand_new INT NOT NULL,
PRIMARY KEY(id)
);

DELIMITER //
CREATE TRIGGER tg_update_product BEFORE UPDATE ON product
FOR EACH ROW
BEGIN
	INSERT INTO log_update_product(dt_update,name_old,name_new,description_old,description_new,price_old,price_new,stock_old,stock_new,category_old,category_new,brand_old,brand_new)
	VALUES(NOW(), old.name, new.name, old.description, new.description, old.price, new.price, old.stock, new.stock, old.category_id, new.category_id, old.brand_id, new.brand_id);
    END //
    DELIMITER ;
    
    DROP TRIGGER tg_update_product;