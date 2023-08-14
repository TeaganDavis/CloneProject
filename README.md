# Data Converter and Download Time Calculator 🔢
This program allows you to convert data sizes between different units (bytes, kilobytes, megabytes, gigabytes) and calculate download times based on data size and download speed.</p>

> [!IMPORTANT]
> Use this [site](http://www.wu.ece.ufl.edu/links/dataRate/DataMeasurementChart.html) to learn the data conversion rates 

## Components

### Data Class
The Data class provides methods for data size conversion and download time calculation.

It contains the following methods:
- convertToMegabytes(): Converts data amounts between different units to megabytes.
- calculateDownloadTime(): Calculates download time in seconds based on data size and download speed.
- getFormattedDownloadTime(): Formats download time in seconds to minutes and seconds.
- toString(): Generates a string representation of data and download time. In minutes and seconds.

### Main Class

The Main class contains the main method that interacts with the user via the console to input data type and download speed. 
It creates an instance of the Data class and displays the calculated download time using the Data classes toString().

### Data Test Class

The DataTest class contains JUnit test cases to verify the correctness of the methods in the Data class. It ensures accurate data conversions and download time calculations.

### 👩‍💻 Example
Here is an example how the program works:

    Enter the amount of data: 1024
    Enter the unit (bytes, kilobytes, megabytes, gigabytes): megabytes
    Enter your download speed (in megabits per second): 10
    Data: 1024.0 megabytes
    Download Time: 13 minutes 39 seconds


