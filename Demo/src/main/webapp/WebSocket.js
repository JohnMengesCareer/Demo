/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function webSocketOpen(endpointName)
{
    var wsUri = "ws://" + document.location.host + document.location.pathname + "/../" + endpointName;
    var webSocket = new WebSocket(wsUri);
    webSocket.onopen = function(evt) { console.log("WebSocket Open: " + evt) };
    webSocket.onerror = function(evt) { console.log("WebSocket Error: " + evt) };
    return webSocket;
}

function webSocketSend(webSocket, message)
{
    var messageString = JSON.stringify(message);
    console.log("webSocketSend:" + messageString);
    webSocket.send(messageString);
}
