def inverzija_niza(niz):
    stog = []
    inverzni_niz = []

    # Stavljanje elementa na stog
    for element in niz:
        stog.append(element)

    # Uzimanje elemenata sa stoga i dodavanje u inverzni niz
    while stog:
        element = stog.pop()
        inverzni_niz.append(element)

    return inverzni_niz


if __name__ == '__main__':
    niz = [1, 2, 3, 4, 5]
    inverzni = inverzija_niza(niz)
    print(inverzni)
