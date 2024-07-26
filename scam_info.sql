CREATE TABLE scam_info (
    scam_id INT,
    scam_name VARCHAR(100),
    scam_amount FLOAT,
    year INT,
    perpetrator VARCHAR(50),
    state_affected VARCHAR(50),
    number_of_victims INT,
    type_of_scam VARCHAR(50),
    duration INT,
    status VARCHAR(50)
);

ALTER TABLE scam_info
ADD COLUMN media_coverage TEXT,
ADD COLUMN punishment TEXT,
ADD COLUMN investigation_agency VARCHAR(50),
ADD COLUMN recovery_amount FLOAT,
ADD COLUMN affected_sector VARCHAR(50);

ALTER TABLE scam_info
RENAME COLUMN scam_amount TO amount_involved,
RENAME COLUMN state_affected TO state_impacted,
RENAME COLUMN type_of_scam TO scam_category,
RENAME COLUMN status TO current_status,
RENAME COLUMN duration TO scam_duration;

ALTER TABLE scam_info MODIFY COLUMN amount_involved DOUBLE PRECISION;
ALTER TABLE scam_info MODIFY COLUMN punishment VARCHAR(255);
ALTER TABLE scam_info MODIFY COLUMN media_coverage VARCHAR(255);
ALTER TABLE scam_info MODIFY COLUMN recovery_amount DOUBLE PRECISION;
ALTER TABLE scam_info MODIFY COLUMN affected_sector VARCHAR(255);


INSERT INTO scam_info (scam_id, scam_name, amount_involved, year, perpetrator, state_impacted, number_of_victims, scam_category, scam_duration, current_status, media_coverage, punishment, investigation_agency, recovery_amount, affected_sector) VALUES 
(1, 'Satyam Scandal', 7000, 2009, 'Ramalinga Raju', 'Andhra Pradesh', 10000, 'Corporate Fraud', 2, 'Resolved', 'High', 'Imprisonment', 'CBI', 3000, 'IT Sector'),
(2, 'Commonwealth Games Scam', 8000, 2010, 'Suresh Kalmadi', 'Delhi', 5000, 'Corruption', 1, 'Ongoing', 'High', 'None', 'CBI', 1000, 'Sports'),
(3, '2G Spectrum Scam', 176000, 2008, 'A. Raja', 'Pan-India', 20000, 'Telecom Fraud', 1, 'Resolved', 'High', 'Imprisonment', 'ED', 5000, 'Telecom'),
(4, 'Coal Allocation Scam', 185591, 2012, 'Manmohan Singh', 'Pan-India', 15000, 'Corruption', 2, 'Ongoing', 'High', 'None', 'CBI', 6000, 'Coal'),
(5, 'Vyapam Scam', 2000, 2013, 'Shivraj Singh Chouhan', 'Madhya Pradesh', 3000, 'Education Fraud', 5, 'Ongoing', 'High', 'None', 'CBI', 500, 'Education'),
(6, 'PNB Scam', 11400, 2018, 'Nirav Modi', 'Maharashtra', 10000, 'Bank Fraud', 1, 'Ongoing', 'High', 'None', 'CBI', 2000, 'Banking'),
(7, 'Saradha Chit Fund Scam', 2500, 2013, 'Sudipta Sen', 'West Bengal', 17000, 'Ponzi Scheme', 2, 'Resolved', 'High', 'Imprisonment', 'ED', 1000, 'Finance'),
(8, 'Adarsh Housing Scam', 900, 2010, 'Ashok Chavan', 'Maharashtra', 500, 'Corruption', 1, 'Ongoing', 'High', 'None', 'CBI', 100, 'Housing'),
(9, 'Fodder Scam', 950, 1996, 'Lalu Prasad Yadav', 'Bihar', 2000, 'Corruption', 2, 'Resolved', 'High', 'Imprisonment', 'CBI', 500, 'Agriculture'),
(10, 'Telgi Scam', 20000, 2003, 'Abdul Karim Telgi', 'Maharashtra', 5000, 'Stamp Paper Fraud', 2, 'Resolved', 'High', 'Imprisonment', 'CBI', 10000, 'Finance'),
(11, 'Harshad Mehta Scam', 5000, 1992, 'Harshad Mehta', 'Maharashtra', 10000, 'Stock Market Fraud', 1, 'Resolved', 'High', 'Imprisonment', 'SEBI', 2000, 'Finance'),
(12, 'Ketan Parekh Scam', 4000, 2001, 'Ketan Parekh', 'Maharashtra', 8000, 'Stock Market Fraud', 1, 'Resolved', 'High', 'Imprisonment', 'SEBI', 1500, 'Finance'),
(13, 'Chopper Scam', 3600, 2013, 'SP Tyagi', 'Pan-India', 1000, 'Defense Scam', 1, 'Ongoing', 'High', 'None', 'CBI', 500, 'Defense'),
(14, 'Sahara Scam', 24000, 2014, 'Subrata Roy', 'Pan-India', 22000, 'Ponzi Scheme', 2, 'Ongoing', 'High', 'Imprisonment', 'SEBI', 5000, 'Finance'),
(15, 'AgustaWestland Scam', 3600, 2010, 'SP Tyagi', 'Pan-India', 1000, 'Defense Scam', 1, 'Ongoing', 'High', 'None', 'CBI', 500, 'Defense'),
(16, 'Bank of Baroda Scam', 6000, 2015, 'Unknown', 'Pan-India', 5000, 'Bank Fraud', 1, 'Ongoing', 'High', 'None', 'CBI', 1000, 'Banking'),
(17, 'Aircel-Maxis Scam', 4000, 2011, 'Dayanidhi Maran', 'Pan-India', 2000, 'Telecom Fraud', 1, 'Ongoing', 'High', 'None', 'CBI', 500, 'Telecom'),
(18, 'National Herald Scam', 2000, 2012, 'Sonia Gandhi', 'Pan-India', 1000, 'Corruption', 1, 'Ongoing', 'High', 'None', 'ED', 500, 'Media'),
(19, 'CWG Scam', 70000, 2010, 'Suresh Kalmadi', 'Delhi', 5000, 'Corruption', 1, 'Ongoing', 'High', 'None', 'CBI', 1000, 'Sports'),
(20, 'Indian Coal Allocation Scam', 185591, 2012, 'Unknown', 'Pan-India', 20000, 'Corruption', 2, 'Ongoing', 'High', 'None', 'CBI', 6000, 'Coal');

-- Updating data in scam_info
UPDATE scam_info SET amount_involved = 7500 WHERE scam_id = 1;
UPDATE scam_info SET year = 2010 WHERE scam_id = 1;
UPDATE scam_info SET punishment = 'Life Imprisonment' WHERE scam_id = 1;
UPDATE scam_info SET recovery_amount = 3200 WHERE scam_id = 1;
UPDATE scam_info SET scam_duration = 3 WHERE scam_id = 1;

UPDATE scam_info SET amount_involved = 8500 WHERE scam_id = 2;
UPDATE scam_info SET year = 2011 WHERE scam_id = 2;
UPDATE scam_info SET punishment = 'None' WHERE scam_id = 2;
UPDATE scam_info SET recovery_amount = 1200 WHERE scam_id = 2;
UPDATE scam_info SET scam_duration = 2 WHERE scam_id = 2;

-- Deleting data from scam_info
DELETE FROM scam_info WHERE scam_id = 3;
DELETE FROM scam_info WHERE scam_id = 4;
DELETE FROM scam_info WHERE scam_id = 5;

-- Fetching data using AND
SELECT * FROM scam_info WHERE year > 2010 AND amount_involved > 10000;

-- Fetching data using OR
SELECT * FROM scam_info WHERE state_impacted = 'Maharashtra' OR recovery_amount > 5000;

-- Fetching data using IN
SELECT * FROM scam_info WHERE scam_name IN ('Satyam Scandal', 'Commonwealth Games Scam');

-- Fetching data using NOT IN
SELECT * FROM scam_info WHERE perpetrator NOT IN ('Ramalinga Raju', 'Suresh Kalmadi');
