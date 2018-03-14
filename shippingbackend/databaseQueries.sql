CREATE TABLE `onlineshopping`.`category` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `description` VARCHAR(255) NULL,
  `image_url` VARCHAR(45) NULL,
  `is_active` INT(1) NOT NULL,
  CONSTRAINT pk_category_id PRIMARY KEY (`id`));