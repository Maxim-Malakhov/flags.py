country = input("Enter the two-letter country code: ")
flag = []
for s in country:
    flag.append(chr(ord(s) + 127397))
print(''.join(flag))
