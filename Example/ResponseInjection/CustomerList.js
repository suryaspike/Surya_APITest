function GetTemplateResponse (request, state, logger) {
response = JSON.parse("<%- stringify(filename, 'StubTemplate\\CustomerList.json') %>");
return {
statusCode : 404,
headers: {
'Content-Type': 'application/json; charset=utf-8'
},
body: response
};
}