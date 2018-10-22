var exec = require('cordova/exec');

exports.printMethod = function (arg0, success, error)
module.exports.printMethod = function (arg0, success, error)
{
    exec(success, error, 'printer', 'printMethod', [arg0]);
};

// Fonction d'addition
module.exports.plus = function(args, succ, erro)
{
    exec(succ, erro, "printer", "plus", [args]);
}

// Fonction de soustraction
module.exports.moin = function(args, succ, erro)
{
    exec(succ, erro, "printer", "moin", [args]);
}