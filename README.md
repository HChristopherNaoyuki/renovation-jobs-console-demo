# Home Makeover Report Application

## Overview

The Home Makeover Report application is a Java program designed to generate a summary report of renovation jobs completed each month. It tracks the number of renovations in three categories: bathrooms, kitchens, and gardens, providing a clear overview of monthly activity.

## Features

- Displays a report of renovation counts for each month.
- Calculates and highlights monthly totals.
- Distinguishes months with 15 or more total renovations.

## Components

- **RenovationJobs Class**: The main class that contains the logic to print the home makeover report, including monthly renovation data and totals.

## Installation

1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Clone or download this repository to your local machine.
3. Navigate to the project directory.

## Usage

To run the application:

1. Open your terminal or command prompt.
2. Navigate to the project directory.
3. Compile the Java file using:
   ```bash
   javac RenovationJobs.java
   ```
4. Run the application using:
   ```bash
   java RenovationJobs
   ```

## Output

The application will generate a report similar to the following:

```
----------------------------------------------------------
HOME MAKEOVER REPORT
----------------------------------------------------------
                Bathrooms   Kitchens    Garden
JAN              8          2          5
FEB              7          4          5
MAR              5          5          2
APR              2          2          3
MAY              7          7          9
JUN              7          8          5
----------------------------------------------------------
MONTHLY TOTALS
----------------------------------------------------------
JAN              15      ***
FEB              16      ***
MAR              12
APR              7
MAY              23      ***
JUN              20      ***
----------------------------------------------------------
```

## Conclusion

This application provides a straightforward way to track and report on home renovation jobs across different categories, making it a useful tool for project management and analysis.
