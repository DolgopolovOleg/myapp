<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">



        <div class="body">
            <h1>Users</h1>

            <ul>
                <c:forEach items="${users}" var="curUser">
                    <li>${curUser.name}</li>
                </c:forEach>
            </ul>

        </div>



    </tiles:putAttribute>
</tiles:insertDefinition>