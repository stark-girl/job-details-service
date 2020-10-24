DROP TABLE IF EXISTS USER;
DROP TABLE IF EXISTS JOB;

CREATE TABLE USER(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  user_id VARCHAR(250) NOT NULL UNIQUE,
  user_name VARCHAR(250) NOT NULL
);

CREATE TABLE JOB(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  job_name VARCHAR(250) NOT NULL,
  job_description VARCHAR(250) NOT NULL,
  user_id VARCHAR(250),
  foreign key (user_id) references User(user_id)
);