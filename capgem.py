import itertools
a = [['a','b'], ['c']]
print(list(itertools.chain.from_iterable(a)))
