var sock = new SockJs('spittr');
var stomp = Stomp.over(sock);

stomp.connect("guest","guest",function (frame) {
    console.log('Connected');
    stomp.subscribe("topic/spittlefeed", handleSpittle);
});

function handleSpittle(incoming) {
    var spittle = JSON.parse(incoming.body);
    console.log('Received: ',spittle);
    var source = $("#spittle-template").html();
    var template = Handlebars.compile(spittle);
    var spittleHtml = template(spittle);
    $('.spittleList').prepend(spittleHtml);
}


