function scroll(a, b, c, d) {
    var element = a;
    var deltaY = b;
    var box = element.getBoundingClientRect();
    var clientX = box.left + (c || box.width / 2);
    var clientY = box.top + (d || box.height / 2);
    var target = element.ownerDocument.elementFromPoint(clientX, clientY);
    for (var e = target; e; e = e.parentElement) {
        target.dispatchEvent(new WheelEvent('wheel', {
            view: window,
            bubbles: true,
            cancelable: true,
            clientX: clientX,
            clientY: clientY,
            deltaY: deltaY
        }));
        return;
    }
}