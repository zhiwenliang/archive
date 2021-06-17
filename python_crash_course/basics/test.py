#!/usr/bin/python3

import utils.file_utils as fu
import utils.json_utils as ju


def test_file_utils():
    try:
        contents = fu.open_file("./basic/basic.py")
        new_file = "./out.txt"
        fu.write_to_file(new_file, contents)
        fu.append_to_file(new_file, contents)
    except Exception:
        print("Error, please contact administrator.")


def test_json_utils():
    file_path = "./test.json"
    json_arr = [12, 12, 12, 2334, 45, 6, 56, 221, 12]
    ju.dump_json_to_file(json_arr, file_path)
    print(ju.load_json_file(file_path))


# test_file_utils()
# test_file_utils()
test_json_utils()
