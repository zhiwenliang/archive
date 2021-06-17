def open_file(file):
    with open(file) as file_object:
        contents = file_object.read()
    return contents


def write_to_file(file, content):
    with open(file, "r+") as file_object:
        file_object.write(content)


def append_to_file(file, content):
    with open(file, "a") as file_object:
        file_object.write(content)
