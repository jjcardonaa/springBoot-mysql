CREATE  TABLE IF NOT EXISTS `company_db`.`employee` (
  `id_employee` INT,
  `id_person` INT,
  `id_project` INT,
  `id_role` INT,
  `id_department` INT,
  `id_person` VARCHAR(150) NOT NULL,
  `status` VARCHAR(150) NOT NULL ,
  PRIMARY KEY (`id_employee`) );

CREATE  TABLE IF NOT EXISTS `company_db`.`person` (
  `id_person` INT,
  `id_visa` INT,
  `id_country` INT,
  `id_state` INT,
  `id_passport` VARCHAR(150) NOT NULL,
  `name` VARCHAR(150) NOT NULL,
  `telephone` VARCHAR(150) NOT NULL ,
  `email` VARCHAR(150) NOT NULL ,
  `email2` VARCHAR(150) NOT NULL ,
  `last_name` VARCHAR(150) NOT NULL ,
  `middle_name` VARCHAR(150) NOT NULL ,
  `date_join` VARCHAR(150) NOT NULL ,
  `rate` VARCHAR(150) NOT NULL ,
  `i94` VARCHAR(150) NOT NULL ,
  `age` VARCHAR(150) NOT NULL ,
  `present_employeer` INT NOT NULL ,
  `gender` VARCHAR(2) NOT NULL ,
  `nationality` VARCHAR(150) NOT NULL ,
  `passport_from` DATE  NOT NULL
  `passport_expired` DATE NOT NULL
  `visa_issued` DATE  NOT NULL
  `visa_expire` DATE NOT NULL ,
  `address1` VARCHAR(150) NOT NULL ,
  `address2` VARCHAR(150) NOT NULL ,
  `zip_code` VARCHAR(150) NOT NULL ,
  `years_experience` VARCHAR(150) NOT NULL ,
  `status_` VARCHAR(150) NOT NULL ,
  `degree` VARCHAR(150) NOT NULL ,
  PRIMARY KEY (`id_person`) );


CREATE  TABLE IF NOT EXISTS `company_db`.`experience` (
  `id_experience` INT,
  `id_employee` INT,
  `from_date` DATE  NOT NULL
  `to_date` DATE NOT NULL ,
  `present_employeer` VARCHAR(150) NOT NULL ,
  PRIMARY KEY (`id_experience`) );

CREATE  TABLE IF NOT EXISTS `company_db`.`country` (
  `id_country` INT,
  `name_country` VARCHAR(150) NOT NULL ,
  PRIMARY KEY (`id_country`) );


CREATE  TABLE IF NOT EXISTS `company_db`.`company` (
  `id_company` INT,
  `name_company` VARCHAR(150) NOT NULL,
  `phone_company` VARCHAR(150) NOT NULL ,
  PRIMARY KEY (`id_company`) );

CREATE  TABLE IF NOT EXISTS `company_db`.`roles` (
  `id_role` INT,
  `name_role` VARCHAR(150) NOT NULL,
  `description_role` VARCHAR(150) NOT NULL ,
  PRIMARY KEY (`id_role`) );

CREATE  TABLE IF NOT EXISTS `company_db`.`project` (
  `id_project` INT,
  `name_project` VARCHAR(150) NOT NULL,
  `description_project` VARCHAR(150) NOT NULL ,
  PRIMARY KEY (`id_project`) );