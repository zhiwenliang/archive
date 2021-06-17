import matplotlib.pyplot as plt

x_values = range(1, 1001)
y_values = [x**2 for x in x_values]

plt.style.use("seaborn")
fig, ax = plt.subplots()
ax.scatter(x=x_values, y=y_values, c=y_values, cmap=plt.cm.Blues, s=10)

# Set chart title and label axes
ax.set_title("Square Nums")

# Set the range for each axis.
ax.axis([0, 1100, 0, 1100000])

# plt.show()
plt.savefig("./data_visualization/square_plot.png", bbox_inches="tight")
plt.show()
