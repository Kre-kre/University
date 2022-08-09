
INSERT INTO users (username, password, enabled)
VALUES
    ('Ira', '{noop}Ira', TRUE),
    ('Max', '{noop}Max', TRUE),
    ('Frank', '{bcrypt}$2a$10$VZEze6SaXG8sYqvmVlPRi.R.x8Ubq7AGjc5EF0b1ioa3asEAnXXA6', TRUE);

INSERT INTO authorities (username, authority)
VALUES
    ('Ira', 'ROLE_STUDENT'),
    ('Frank', 'ROLE_TEACHER'),
    ('Max', 'ROLE_STUDENT')