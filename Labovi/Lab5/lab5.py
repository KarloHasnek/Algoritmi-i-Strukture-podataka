from string import punctuation


def generiraj_strukturu_podataka(recenica):
    frekvencije = {}
    for znak in recenica:
        znak = znak.lower()  # Pretvorba u mala slova
        if znak.isalnum() and not znak.isdigit() and znak != " " or znak in punctuation:
            if znak in frekvencije:
                frekvencije[znak] += 1
            else:
                frekvencije[znak] = 1
    return frekvencije


def formatiraj_izlaz(frekvencije):
    simboli = []
    slova = []
    for znak, frekvencija in frekvencije.items():
        if znak in punctuation:
            simboli.append((znak, frekvencija))
        else:
            slova.append((znak, frekvencija))

    simboli.sort()
    slova.sort()

    izlaz = ""
    for znak, frekvencija in simboli + slova:
        izlaz += f"Character {znak} occurs {frekvencija} times.\n"
    return izlaz

# Primjer upotrebe
if __name__ == '__main__':
    recenica = "23 This is a se78ntence for tesTing - try THIS only one 1!!"
    rezultat = generiraj_strukturu_podataka(recenica)
    formatirani_izlaz = formatiraj_izlaz(rezultat)
    print(formatirani_izlaz)
