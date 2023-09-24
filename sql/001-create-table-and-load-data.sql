DROP TABLE IF EXISTS workout;

CREATE TABLE workout (
  id int unsigned AUTO_INCREMENT,
  part VARCHAR(100) NOT NULL,
  exercise VARCHAR(100) NOT NULL,
  PRIMARY KEY(id)
)

INSERT INTO workout (part, exercise) VALUES ("胸筋", "ベンチプレス");
INSERT INTO workout (part, exercise) VALUES ("背筋", "デッドリフト");