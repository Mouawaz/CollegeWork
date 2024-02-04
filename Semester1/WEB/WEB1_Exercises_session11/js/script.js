

$.get("xml/members.xml", function (xml, status) {
    var txt= "<table class = 'textBox'><tr><th class='textBox'>First Name</th><th class='textBox'>Eye Color</th></tr>";
    
    var firstname = $(xml).find("firstname");
    var displayName = $(firstname[0]).text();
    $("#textField1").html(displayName);

    var person = $(xml).find("person");
    var displayColor = $(person[0]).attr("eyeColor");
    $("#textField2").html(displayColor);

    var firstname = $(xml).find("firstname");
    var displayName = $(firstname[1]).text();
    $("#textField3").html(displayName);

    var person = $(xml).find("person");
    var displayColor = $(person[1]).attr("eyeColor");
    $("#textField4").html(displayColor);

    var firstname = $(xml).find("firstname");
    var displayName = $(firstname[2]).text();
    $("#textField5").html(displayName);

    var person = $(xml).find("person");
    var displayColor = $(person[2]).attr("eyeColor");
    $("#textField6").html(displayColor);

    var firstname = $(xml).find("firstname");
    var displayName = $(firstname[3]).text();
    $("#textField7").html(displayName);

    var person = $(xml).find("person");
    var displayColor = $(person[3]).attr("eyeColor");
    $("#textField8").html(displayColor);

    
    txt+="<tr>" + "td class = 'textBox'>" +firstname+"</td>"+ "<td class = 'myClass'>" + eyeColor + "</td>"+ "</tr>";
});
txt+= "</table>";
$("#textField1").html.txt;




