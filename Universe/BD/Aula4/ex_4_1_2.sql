if OBJECT_ID(N'[Flights_Seat]') is not null
    DROP TABLE [Flights_Seat]
GO
if OBJECT_ID(N'[Flights_Leg_Instance]') is not null
    DROP TABLE [Flights_Leg_Instance]
GO
if OBJECT_ID(N'[Flights_Airplane_type]') is not null
    DROP TABLE [Flights_Airplane_type]
GO
if OBJECT_ID(N'[Flights_Flight_Leg]') is not null
    DROP TABLE [Flights_Flight_Leg]
GO
if OBJECT_ID(N'[Flights_Fare]') is not null
    DROP TABLE [Flights_Fare]
GO
if OBJECT_ID(N'[Flights_Airplane]') is not null
    DROP TABLE [Flights_Airplane]
GO
if OBJECT_ID(N'[Flights_Flight]') is not null
    DROP TABLE [Flights_Flight] 
GO
if OBJECT_ID(N'[Flights_Airport]') is not null
    DROP TABLE [Flights_Airport]
GO

CREATE TABLE [Flights_Flight] (
    [Number] [int] NOT NULL,
    [Airline] [varchar](128) NOT NULL,
    [Weekdays] [varchar](7) NOT NULL,
    PRIMARY KEY ( [Number] )
)
GO

CREATE TABLE [Flights_Airport] (
    [Airport_code] [varchar](3) NOT NULL,
    [Name] [varchar](128) NOT NULL,
    [City] [varchar](128) NOT NULL,
    [State] [varchar](128) NOT NULL,
    PRIMARY KEY ( [Airport_code] )
)
GO

CREATE TABLE [Flights_Airplane] (
    [Airplane_ID] [varchar](128) NOT NULL,
    [Total_no_of_seats] [int] NOT NULL,
    PRIMARY KEY ( [Airplane_ID] )
)
GO

CREATE TABLE [Flights_Fare] (
    [Fare_Code] [int] NOT NULL,
    [Amout] [float] NOT NULL,
    [Flight_Number] [int] NOT NULL REFERENCES [Flights_Flight] ([Number]),
    PRIMARY KEY ( [Fare_Code] )
)

CREATE TABLE [Flights_Flight_Leg] (
    [Leg_Number] [int] NOT NULL,
    [Scheduled_arr_time] [time] NOT NULL,
    [Scheduled_dep_time] [time] NOT NULL,
    [Flight_Number] [int] NOT NULL REFERENCES [Flights_Flight] ([Number]),
    [Flight_Airport_code] [varchar](3) NOT NULL REFERENCES [Flights_Airport] ([Airport_code]),
    PRIMARY KEY ( [Leg_Number] )
)

CREATE TABLE [Flights_Airplane_type] (
    [Max_seats] [int] NOT NULL,
    [Company] [varchar](128) NOT NULL,
    [Type_name] [varchar](128) NOT NULL,
    [Airplane_Airplane_ID] [varchar](128) NOT NULL REFERENCES [Flights_Airplane] ([Airplane_ID]),
    PRIMARY KEY ( [Type_name] )
)
GO

CREATE TABLE [Flights_Leg_Instance] (
    [Flight_Leg] [int] NOT NULL,
    [Date] [date] NOT NULL,
    [Flight_Leg_Leg_Number] [int] NOT NULL REFERENCES [Flights_Flight_Leg] ([Leg_Number]),
    [Flight_Number] [int] NOT NULL REFERENCES [Flights_Flight] ([Number]),
    [Airplane_Airplane_ID] [varchar](128) NOT NULL REFERENCES [Flights_Airplane] ([Airplane_ID]),
    PRIMARY KEY ( [Flight_Leg] )
)

CREATE TABLE [Flights_Seat] (
    [Seat_number] [int] NOT NULL,
    [Customer_Name] [varchar](128) NOT NULL,
    [Customer_Phone] [varchar](128) NOT NULL,
    [Flight_Number] [int] NOT NULL REFERENCES [Flights_Flight] ([Number]),
    [Airplane_Airplane_ID] [varchar](128) NOT NULL REFERENCES [Flights_Airplane] ([Airplane_ID]),
    [Leg_Instance_Flight_Leg] [int] NOT NULL REFERENCES [Flights_Leg_Instance] ([Flight_Leg]),
    [Airport_Airport_code] [varchar](3) NOT NULL REFERENCES [Flights_Airport] ([Airport_code]),
    [Flight_Leg_Leg_Number] [int] NOT NULL REFERENCES [Flights_Flight_Leg] ([Leg_Number]),
    PRIMARY KEY ( [Seat_number] )
)