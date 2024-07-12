CREATE TABLE t_inventory (
                             id SERIAL PRIMARY KEY,
                             sku_code VARCHAR(255) DEFAULT NULL,
                             quantity INTEGER DEFAULT NULL
);
