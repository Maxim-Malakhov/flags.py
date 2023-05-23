country = input("Введите двухбуквенный код страны: ")
print(b''.join([b'\xf0\x9f\x87' + bytes.fromhex(hex(ord(s)+101)[2:]) for s in country]).decode())
