let checkboxes = Array.prototype.slice.call( document.getElementsByClassName("select-check"));

let selectedItemsLabel = document.getElementById("selected_items_label");

let checkedElementsIds = []


let setCheckedItemsIds = () => {
    Array.prototype.filter(ch => ch.t)
    checkedElementsIds = checkboxes
        .filter( ch => ch.checked)
        .map(el => el.id.split("_")[0]);
}

let setSelectedItemsLabel = () => {
    selectedItemsLabel.innerHTML = `${checkedElementsIds.length} items selected`;
}

function updateStates() {
    setCheckedItemsIds();
    setSelectedItemsLabel();
    console.log(checkedElementsIds)
}

function deleteSelectedItems() {
    let error = false;
    axios.delete(`${window.location.href}/delete/${checkedElementsIds.join('1234_1234')}`)
        .catch(() => error = true)
    error ? alert("Error occurred while deleting some elements.") : undefined

}
