import unittest
import utils.json_utils as ju


class JsonUtilsTestCase(unittest.TestCase):
    def test_load_json(self):
        a = input("input anything: ")
        path = "./test_file"
        ju.dump_json_to_file(a, path)
        result = ju.load_json_file(path)
        self.assertEqual(result, a)


if __name__ == "__main__":
    unittest.main()
