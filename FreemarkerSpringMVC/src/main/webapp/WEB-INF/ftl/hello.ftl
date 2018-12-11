${info}
${.version}
${map.name}-${map.age}
<div style="border: 1px red">
    <h1>${date?date}</h1>
</div>

<div style="font-size: xx-large;">
    <#list studentList as student>
        <span style="font: large;color: aqua">${student.id}-${student.name},${student.age},${student.birthday?date}</span>
        <br/>
    </#list>
</div>