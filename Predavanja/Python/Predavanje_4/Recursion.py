import matplotlib.pyplot as plt


def draw_triangle(x, y, a, ax):
    plt.plot([x, x+a], [y, y], 'k')
    v = a * (3)**(0.5) / 2
    plt.plot([x, x+a/2], [y, y+v], 'k')
    plt.plot([x+a, x+a/2], [y, y+v], 'k')


def fractal(x, y, a, ax):
    if a > 1:
        draw_triangle(x,y,a,ax)
        fractal(x+a/2, y, a/2, ax)
        fractal(x, y, a/2, ax)
        v = a * (3) ** (0.5) / 2
        fractal(x+a/4, y+v/2, a/2, ax)


fig, ax = plt.subplots()
fractal(0, 0, 100, ax)
plt.show()
