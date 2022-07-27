export const options = {
    plotOptions: {
        bar: {
            horizontal: true,
        }
    },
};

export const mockData = {
    labels: {
        categories: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
    },
    series: [
        {
            name: "% Sucesso",
            data: [43.6, 67.1, 67.7, 45.6, 71.1]
        }
    ]
};


// export enum ClassificacaoRiscoEnum {
//     EMERGENCIA = 'EMERGENCIA',
//     URGENTE = 'URGENTE',
//     POUCO_URGENTE = 'POUCO_URGENTE',
//     NAO_URGENTE = 'NAO_URGENTE',
// }

// export const classificacaoRiscoEnumArray = [
//     ClassificacaoRiscoEnum.EMERGENCIA,
//     ClassificacaoRiscoEnum.URGENTE,
//     ClassificacaoRiscoEnum.POUCO_URGENTE,
//     ClassificacaoRiscoEnum.NAO_URGENTE,
// ];

// export const classificacaoRisco = [
//     { codigo: 1, descricao: 'Emergência' },
//     { codigo: 2, descricao: 'Urgente' },
//     { codigo: 3, descricao: 'Pouco Urgente' },
//     { codigo: 4, descricao: 'Não Urgente' },
// ]