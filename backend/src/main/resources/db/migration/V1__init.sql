CREATE TABLE risk_items (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    description TEXT,
    category VARCHAR(100),
    status VARCHAR(50),
    risk_score INT,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);