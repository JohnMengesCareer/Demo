/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function runDemo()
{
    var webSocket = webSocketOpen("BalancedParentheses");
    
    var string = document.forms["form"]["string"].value;
    var message = {
        "string": string,
        "stepDelay" : 1000
    }
    webSocket.onopen = function(evt) {webSocketSend(webSocket, message)};
    webSocket.onmessage = function(evt) {
        var jsonData = JSON.parse(evt.data);
        draw(jsonData);
    };
}

function draw(data)
{
    console.log("draw " + data);
    d3.select("#output");
    
}

