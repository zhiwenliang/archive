import csv
import matplotlib.pyplot as plt
from datetime import datetime

filename = "data/sitka_weather_2018_simple.csv"
with open(filename) as f:
    reader = csv.reader(f)
    header_row = next(reader)

    # Get high temperatures from this file.
    dates, highs = [], []
    for row in reader:
        high = int(row[5])
        current_date = datetime.strptime(row[2], '%Y-%m-%d')
        dates.append(current_date)
        highs.append(high)

    # Plot the high temperatures
    plt.style.use("seaborn")
    fig, ax = plt.subplots()
    ax.plot(dates, highs, c="red")
    fig.autofmt_xdate()

    # Format plot
    plt.title('Daily High Temperatures, 2018', fontsize=24)
    plt.xlabel("Date", fontsize=16)
    plt.ylabel('Temperature (F)', fontsize=16)
    plt.tick_params(axis='both', which='major', labelsize=16)

    plt.show()