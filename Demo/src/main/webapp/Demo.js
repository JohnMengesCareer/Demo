var webSocket;

function onMessage(evt)
{
    console.log("received " + evt.data);
    var message = JSON.parse(evt.data);
    if (message.hasOwnProperty("demos"))
    {
        var output = d3.select("#output");
        output
            .append("ul")
            .selectAll("li")
            .data(message.demos)
            .enter()
            .append("li")
            .append("a")
            .attr("id", function(d) {return d})
            .attr("href", "javascript:;")
            .attr("onclick", "selectDemo(this)")
            .text(function(d) {return d});
    }
}

function selectDemo(demo)
{
    console.log("selectDemo " + demo.id);
    var message = {
        "demo" : demo.id
    };
    webSocketSend(webSocket, message);
    return false;
}

function connect()
{
    webSocket = webSocketOpen("demo");
    webSocket.onmessage = onMessage;
}

window.onload = connect;