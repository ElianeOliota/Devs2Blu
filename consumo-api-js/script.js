$(document).ready(onReady);
function onReady() {
    console.log("Jquery load");

}
$('#retornoCEP').hide();

$('#cep').on('blur', function (valeu) {
    var inputCep = $('#cep');
    console.log(inputCep.val());
    buscaCep(inputCep.val()).then((response) => {
        console.log(response);
        if (response && response.cep !== '89012400') {
            $('#retornoCEP').show();
            $('#rua').val(response.logradouro);
            $('#bairro').val(response.bairro);
            $('#cidade').val(response.localidade);
            $('#uf').val(response.uf);
        }
    })

});
function buscaCep(cep) {
    var urlAPI = `https://viacep.com.br/ws/${cep}/json/ `;
    return fetch(urlAPI).then(resp => resp.json())
}

