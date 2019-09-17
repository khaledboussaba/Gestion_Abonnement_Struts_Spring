<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="css/style.css" />
	<title>Produits</title>
</head>
<body>
	
	<div>
		<s:form action="save" method="post">
			<s:hidden name="editMode"></s:hidden>
			<s:textfield label="REFERENCE" name="produit.reference"></s:textfield>
			<s:textfield label="DESIGNATION" name="produit.designation"></s:textfield>
			<s:textfield label="PRIX" name="produit.prix"></s:textfield>
			<s:textfield label="QUANTITE" name="produit.quantite"></s:textfield>
			<s:checkbox label="PROMO" name="produit.promo"></s:checkbox>
			<s:submit value="Save"></s:submit>
		</s:form>
	</div>
	
	<div>
		<table class="table1">
			<tr>
				<th>REF</th>
				<th>DES</th>
				<th>PRIX</th>
				<th>QTE</th>
				<th>PROMO</th>
			</tr>
			<s:iterator value="produits">
				<tr>
					<td><s:property value="reference" /></td>
					<td><s:property value="designation" /></td>
					<td><s:property value="prix" /></td>
					<td><s:property value="quantite" /></td>
					<td><s:property value="promo" /></td>
					<s:url namespace="/" action="edit" var="lien1">
						<s:param name="ref">
							<s:property value="reference"/>
						</s:param>
					</s:url>
					<s:url namespace="/" action="delete" var="lien2">
						<s:param name="ref">
							<s:property value="reference"/>
						</s:param>
					</s:url>
					<td><s:a href="%{lien1}">Editer</s:a></td>
					<td><s:a href="%{lien2}">Supprimer</s:a></td>
				</tr>
			</s:iterator>
		</table>
	</div>
	
</body>
</html>