import json


def dump_json_to_file(json_obj, file_path):
    with open(file_path, "w") as f:
        json.dump(json_obj, f)


def load_json_file(file_path):
    with open(file_path) as f:
        result = json.load(f)
    return result
