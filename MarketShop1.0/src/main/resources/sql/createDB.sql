CREATE USER IF NOT EXISTS marketmanager@localhost identified BY 'root';
GRANT usage ON *.* TO marketmanager@localhost identified BY 'root';
CREATE DATABASE IF NOT EXISTS markeshop;
GRANT ALL privileges ON marketmanager.* TO marketmanager@localhost;
USE markeshop;

commit;