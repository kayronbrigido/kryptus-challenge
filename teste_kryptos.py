funcao = '';
lista_numero = [];

while funcao != 'exit':

    funcao = input();
    fun = funcao.split(' ');
    funcao = fun[0];

    try:
        if funcao == 'put':
            x = int(fun[1]);
            lista_numero.append(x);

            for i in lista_numero:
                print(i, end=' ');

            print();

    except:
        print('Put declarado de forma inválida');

    try:
        if funcao == 'get':
            x = int(fun[1]);
            print(lista_numero[x - 1]);

        if funcao == 'first':
            print(lista_numero[0]);

        if funcao == 'last':
            print(lista_numero[len(lista_numero) - 1]);

    except:
        print('Lista esta vazia');

    try:
        if funcao == 'remove':
            x = int(fun[1]);
            print(lista_numero[x - 1])
            for i in lista_numero:
                print(i, end=' ');

            print();
    except:
        print('Funcao declarada invalida ou valor superior a list')

    if funcao == 'list':
        for i in lista_numero:
            print(i, end=' ');

        print();

    if funcao == 'clear':
        lista_numero.clear();

    if funcao == 'sort':

        lista_numero.sort()
        for i in lista_numero:
            print(i, end=' ');

        print();
