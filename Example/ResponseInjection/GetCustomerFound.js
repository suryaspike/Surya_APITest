function GetTemplateResponse (request, state, logger) {
var ext =require('./../../../Example/ResponseInjection/extractrequest');
var reqdata = ext.extractor(request);
var test = ['1111' , '2222' , '3333' , '4444' , '5555' ,'6666'];
console.log(test.includes(reqdata.CustomerID));
if (test.includes(reqdata.CustomerID) == false){
    console.log('Not found');
    response = JSON.parse("<%- stringify(filename, 'StubTemplate\\CustomerNotFoundView.json') %>");
    return {
        statusCode : 404,
        headers: {
        'Content-Type': 'application/json; charset=utf-8'
        },
        body: response
        };
}else{
if(test.includes(reqdata.CustomerID) == false){response = JSON.parse("<%- stringify(filename, 'StubTemplate\\CustomerNotFoundView.json') %>");};
if(reqdata.CustomerID=='1111'){response = JSON.parse("<%- stringify(filename, 'StubTemplate\\1111.json') %>");};
if(reqdata.CustomerID=='2222'){response = JSON.parse("<%- stringify(filename, 'StubTemplate\\2222.json') %>");};
if(reqdata.CustomerID=='3333'){response = JSON.parse("<%- stringify(filename, 'StubTemplate\\3333.json') %>");};
if(reqdata.CustomerID=='4444'){response = JSON.parse("<%- stringify(filename, 'StubTemplate\\4444.json') %>");};
if(reqdata.CustomerID=='5555'){response = JSON.parse("<%- stringify(filename, 'StubTemplate\\5555.json') %>");};
if(reqdata.CustomerID=='6666'){response = JSON.parse("<%- stringify(filename, 'StubTemplate\\6666.json') %>");};
return {
statusCode : 200,
headers: {
'Content-Type': 'application/json; charset=utf-8'
},
body: response
};
};
}